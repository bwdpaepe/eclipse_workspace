package silvertiger.tutorial.lwjgl;

import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.glfwCreateWindow;
import static org.lwjgl.glfw.GLFW.glfwDestroyWindow;
import static org.lwjgl.glfw.GLFW.glfwGetFramebufferSize;
import static org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor;
import static org.lwjgl.glfw.GLFW.glfwGetTime;
import static org.lwjgl.glfw.GLFW.glfwGetVideoMode;
import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSetErrorCallback;
import static org.lwjgl.glfw.GLFW.glfwSetKeyCallback;
import static org.lwjgl.glfw.GLFW.glfwSetWindowPos;
import static org.lwjgl.glfw.GLFW.glfwSetWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwSwapInterval;
import static org.lwjgl.glfw.GLFW.glfwTerminate;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_TRIANGLES;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glVertex3f;
import static org.lwjgl.opengl.GL11.glViewport;
import static org.lwjgl.system.MemoryUtil.NULL;

import java.nio.IntBuffer;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;

public class Introduction {

private static GLFWErrorCallback errorCallback = GLFWErrorCallback.createPrint(System.err);
	
	private static GLFWKeyCallback keyCallback = new GLFWKeyCallback() {
		@Override
		public void invoke(long window, int key, int scancode, int action, int mods) {
			if(key == GLFW_KEY_ESCAPE && action == GLFW_PRESS) {
				glfwSetWindowShouldClose(window, true);
			}
		}
	};
	
	public static void main(String[] args) {
		
		/*
		 * Application app = new Application(); app.run();
		 */
		
		System.out.println("LWJGL Version " + Version.getVersion() + " is working.");
		
		glfwSetErrorCallback(errorCallback);
		
		if (!glfwInit()) {
			throw new IllegalStateException("Unable to initialize GLFW");
		}
		
		long window = glfwCreateWindow(640, 480, "Simple example", NULL, NULL);
		if (window == NULL) {
			glfwTerminate();
			throw new RuntimeException("Failed to create the GLFW window");
		}
		
		GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window,
							(vidMode.width() - 640) / 2,
							(vidMode.height() - 480) / 2
		);
		
		glfwMakeContextCurrent(window);
		GL.createCapabilities();
		
		glfwSwapInterval(1);
		
		glfwSetKeyCallback(window, keyCallback);
		
		IntBuffer width = MemoryUtil.memAllocInt(1);
		IntBuffer height = MemoryUtil.memAllocInt(1);
		
		while(!glfwWindowShouldClose(window)) {
			float ratio;
			
			glfwGetFramebufferSize(window, width, height);
			ratio = width.get() / (float) height.get();
			
			width.rewind();
			height.rewind();
			
			glViewport(0, 0, width.get(), height.get());
			glClear(GL_COLOR_BUFFER_BIT);
			
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			glOrtho(-ratio, ratio, -1f, 1f, 1f, -1f);
			glMatrixMode(GL_MODELVIEW);
			
			glLoadIdentity();
			glRotatef((float) glfwGetTime() * 50f, 0f, 0f, 1f);
			
			glBegin(GL_TRIANGLES);
			glColor3f(1f, 0f, 0f);
			glVertex3f(-0.6f, -0.4f, 0f);
			glColor3f(0f, 1f, 0f);
			glVertex3f(0.6f, -0.4f, 0f);
			glColor3f(0f, 0f, 1f);
			glVertex3f(0f, 0.6f, 0f);
			glEnd();
			
			glfwSwapBuffers(window);
			glfwPollEvents();
			
			width.flip();
			height.flip();
			
			
		}
		
		glfwDestroyWindow(window);
		keyCallback.free();
		glfwTerminate();
		errorCallback.free();
	}


}

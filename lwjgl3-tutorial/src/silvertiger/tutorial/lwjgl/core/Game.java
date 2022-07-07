package silvertiger.tutorial.lwjgl.core;

import org.lwjgl.glfw.GLFWErrorCallback;

public abstract class Game {
	
	public static final int TARGET_FPS = 75;
	public static final int TARGET_UPS = 30;
	
	private GLFWErrorCallback errorCallback;
	
	protected boolean running;
	
	protected Window window;
	
	protected Timer timer;
	
	protected Renderer renderer;
	
	protected StateMachine state;

	public Game() {
		this.timer = new Timer();
		this.renderer = new Renderer();
		this.state = new StateMachine();
	}
	
	public void start() {
		init();
		gameLoop();
		dispose();
	}
	
	public void dispose() {
		this.renderer.dispose();
		
		state.change(null);
		
		window.destroy();
		
		glfwTerminate();
		errorCallback.free();
	}
	
	public void init() {
		errorCallback = GLFWErrorCallback.createPrint();
		glfwSetErrorCallback(errorCallback);
		if(!glfwInit()) {
			throw new IllegalStateException("Unable to initialize GLFW!");
		}
		window = new Window(640, 480, "Simple Game - Pong", true);
		
		time.init();
		
		renderer.init();
		
		initStates();
		
		running = true;
	}
	
	public void initStates() {
		if(Game.isDefaultContext()) {
			state.add("example", new ExampleState());
			state.add("texture", new TextureState());
		}
		else {
			state.add("example", new LegacyExampleState());
			state.add("texture", new LegacyTextureState());
		}
		state.add("game", new GameState(renderer));
		state.change("game");
	}
	
	public abstract void gameLoop();
	
	public void input() {
		state.input();
	}
	
	public void update() {
		state.update();
	}
	
	public void update(float delta) {
		state.update(delta);
	}

}

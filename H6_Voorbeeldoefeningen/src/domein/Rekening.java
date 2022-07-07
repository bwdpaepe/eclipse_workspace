package domein;

public class Rekening {
	private long rekeningnummer;
    private double saldo;
    private String houder;

    public Rekening()
    {
        setRekeningnummer(123456789);
        setHouder("onbekend");
    }

    public Rekening(long rekeningnummer)
    {
        setRekeningnummer(rekeningnummer);
        setHouder("onbekend");
    }

    public Rekening(long rekeningnummer, String houder)
    {
        setRekeningnummer(rekeningnummer);
        setHouder(houder);
    }

    private void setRekeningnummer(long rekeningnummer)
    {
        this.rekeningnummer = rekeningnummer;
    }

    public long getRekeningnummer()
    {
        return rekeningnummer;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public final void setHouder(String houder)
    {
        this.houder = houder;
    }

    public String getHouder()
    {
        return houder;
    }

    public boolean stortOp(double bedrag)
    {
    	if (bedrag > 0)
         { 
    		saldo += bedrag;
    		return true;
         }
    	return false;
    }
    
    public boolean haalAf(double bedrag)
    {
    	if (bedrag > 0 && saldo >= bedrag)
         { 
    		saldo -= bedrag;
    		return true;
         }
    	return false;
    }
    
    public boolean schrijfBedragOverNaar(double bedrag, Rekening naarRek)
    {
    	if(this.haalAf(bedrag)) {
    		if(!naarRek.stortOp(bedrag)) {	//storten op andere rekening lukt niet
    			this.stortOp(bedrag);
    			return false;
    		}
    		else {
    			return true;
    		}
    	}
    	else {
    		return false;
    	}
    }

    @Override
    public String toString(){
        return String.format("De rekening met rekeningnummer %d behoort toe aan %s en heeft als saldo €%.2f%n", rekeningnummer,
            houder, saldo);
    }
}


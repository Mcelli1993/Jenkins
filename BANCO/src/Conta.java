



public class Conta {
    protected double saldo=0;
    protected double limite=0;
    public Conta(){}
    public Conta(double saldo, double limite){
    	this.saldo=saldo;
    	this.limite=limite;
    }
    
 public boolean saca(double valor){
  if (valor<=saldo){
      
      saldo-=valor;
      return true;
  }
  else{
      return false;
  } 
      
}
  public double deposita(double valor){
    saldo+=valor;
    return saldo;
}  
  public double saldo(){
      
     return  saldo;
      
  } 
  
  public boolean transfere(Conta destino, double valor) {
	  if(saca(valor)){
	  destino.saldo += valor;
	  return true;
	  }
	  else
		  System.out.println("SALDO INSUFICIENTE");
	      return false;
  }
  public void setLimite(double limite){
	  this.limite=limite;
  }
    
}

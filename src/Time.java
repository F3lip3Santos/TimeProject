
public class Time {
	private int hora; 
	private int minuto;
	private int segundo;
	
	
	//0h = 12am
	//1-11 = 1 - 11am
	//13 - 23 = hora - 12pm
	
	public void steTime(int h, int m, int s) {
			
		
	}
	
	public String exibirHoraUniversal() {
		return hora+":"+minuto+":"+segundo;
	}
	
	public String exibirHoraPadrao() {
		String strHora;
		
		if (hora == 0) {
			strHora = 12 + ":" + minuto+":"+segundo+" AM";
		}
		else if (hora == 12) {
			strHora = 12 + ":" + minuto+":"+segundo+" PM";
			
		}
		else if (hora >= 1 && hora <= 11) {
			strHora = hora + ":" + minuto+":"+segundo+" AM";
		}
		else {
			strHora = (hora-12) + ":" + minuto+":"+segundo+" PM";
		}
		
		return strHora;
	}
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	

}

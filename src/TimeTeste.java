
public class TimeTeste {

	public static void main(String[] args) {
		Time t = new Time();
		
		t.setHora(22);
		t.setMinuto(20);
		t.setSegundo(35);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
	}

}

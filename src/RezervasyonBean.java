import java.util.ArrayList;
import java.util.List;
 

public class RezervasyonBean {

	private static int masanumarasý;
	private Masalar masalar=new Masalar(); 
	private Rezervasyon rezervasyon=new Rezervasyon();
	private static List<Masalar> masaliste = new ArrayList<Masalar>();
	private static  List<KisiBilgileri> kisiliste = new ArrayList<KisiBilgileri>();
	private static List<Rezervasyon> liste = new ArrayList<Rezervasyon>();
	public void masaEkle(){
		getMasaliste().add(getMasalar());
		setMasalar(new Masalar());
	
	}
	public void kisiEkle(){
		getKisiliste().add(getMasalar().getBilgileri());
		getMasalar().setBilgileri(new KisiBilgileri());
	}
	public void genelListe(){
		getListe().add(getRezervasyon());
		setRezervasyon(new Rezervasyon());
	}
	public String deneme(){ 
		setMasanumarasý(masalar.getMasano());
		return "gec";
	}
	
	
	
	public List<Masalar> getMasaliste() {
		return masaliste;
	}
	public void setMasaliste(List<Masalar> masaliste) {
		this.masaliste = masaliste;
	}
	public List<KisiBilgileri> getKisiliste() {
		return kisiliste;
	}
	public void setKisiliste(List<KisiBilgileri> kisiliste) {
		this.kisiliste = kisiliste;
	}
	public List<Rezervasyon> getListe() {
		return liste;
	}
	public void setListe(List<Rezervasyon> liste) {
		this.liste = liste;
	}
	public Masalar getMasalar() {
		return masalar;
	}
	public void setMasalar(Masalar masalar) {
		this.masalar = masalar;
	}
	public Rezervasyon getRezervasyon() {
		return rezervasyon;
	}
	public void setRezervasyon(Rezervasyon rezervasyon) {
		this.rezervasyon = rezervasyon;
	}
	public int getMasanumarasý() {
		return masanumarasý;
	}
	public void setMasanumarasý(int masanumarasý) {
		this.masanumarasý = masanumarasý;
	}
}

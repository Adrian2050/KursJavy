package myKurs;

import java.util.Date;

public class Kot {
	String imie;
	Date data;
	Double waga;
	String opiekunImie;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getWaga() {
		return waga;
	}

	public void setWaga(Double waga) {
		this.waga = waga;
	}

	public String getOpiekunImie() {
		return opiekunImie;
	}

	public void setOpiekunImie(String opiekunImie) {
		this.opiekunImie = opiekunImie;
	}

	public Kot(String imie, Date data, double waga, String opiekunImie) {
		super();
		this.imie = imie;
		this.data = data;
		this.waga = waga;
		this.opiekunImie = opiekunImie;
	}

	@Override
	public String toString() {
		return "Kot [imie=" + imie + ", data=" + data + ", waga=" + waga + ", opiekunImie=" + opiekunImie + "]";
	}

}

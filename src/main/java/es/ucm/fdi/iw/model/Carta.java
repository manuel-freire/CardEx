package es.ucm.fdi.iw.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Carta {

	private long id;
	private String name;
	private String manaCost;
	private Integer cmc;
	private String[] colors;
	private String[] colorIdentity;
	private String type;
	private String[] supertypes;
	private String[] types;
	private String[] subtypes;
	private String rarity;

	private Edicion set;
	private String setName;
	private String text;
	private String artist;
	private String number;
	private String power;
	private String toughness;

	private String layout;
	private String multiverseid;
	private String imageUrl;
	private String[] rulings;
	private String[] foreignNames;
	private String[] printings;

	private String estadoCarta;
	private List<Intercambio> intercambiosOfrecidos;
	private List<Intercambio> intercambiosRecibidos;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long idCarta) {
		this.id = idCarta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManaCost() {
		return manaCost;
	}

	public void setManaCost(String manaCost) {
		this.manaCost = manaCost;
	}

	public Integer getCmc() {
		return cmc;
	}

	public void setCmc(Integer cmc) {
		this.cmc = cmc;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public String[] getColorIdentity() {
		return colorIdentity;
	}

	public void setColorIdentity(String[] colorIdentity) {
		this.colorIdentity = colorIdentity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getSupertypes() {
		return supertypes;
	}

	public void setSupertypes(String[] supertypes) {
		this.supertypes = supertypes;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String[] getSubtypes() {
		return subtypes;
	}

	public void setSubtypes(String[] subtypes) {
		this.subtypes = subtypes;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	@ManyToOne(targetEntity = Edicion.class)
	public Edicion getSet() {
		return set;
	}

	public void setSet(Edicion set) {
		this.set = set;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getToughness() {
		return toughness;
	}

	public void setToughness(String toughness) {
		this.toughness = toughness;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getMultiverseid() {
		return multiverseid;
	}

	public void setMultiverseid(String multiverseid) {
		this.multiverseid = multiverseid;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String[] getRulings() {
		return rulings;
	}

	public void setRulings(String[] rulings) {
		this.rulings = rulings;
	}

	public String[] getForeignNames() {
		return foreignNames;
	}

	public void setForeignNames(String[] foreignNames) {
		this.foreignNames = foreignNames;
	}

	public String[] getPrintings() {
		return printings;
	}

	public void setPrintings(String[] printings) {
		this.printings = printings;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public String getEstadoCarta() {
		return estadoCarta;
	}

	public void setEstadoCarta(String estadoCarta) {
		this.estadoCarta = estadoCarta;
	}

	@ManyToMany(targetEntity = Intercambio.class)
	public List<Intercambio> getIntercambiosOfrecidos() {
		return intercambiosOfrecidos;
	}

	public void setIntercambiosOfrecidos(List<Intercambio> intercambiosOfrecidos) {
		this.intercambiosOfrecidos = intercambiosOfrecidos;
	}

	@ManyToMany(targetEntity = Intercambio.class)
	public List<Intercambio> getIntercambiosRecibidos() {
		return intercambiosRecibidos;
	}

	public void setIntercambiosRecibidos(List<Intercambio> intercambiosRecibidos) {
		this.intercambiosRecibidos = intercambiosRecibidos;
	}

}

package ProyectoLenguajeSenas.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import ProyectoLenguajeSenas.Repositorys.LenguaSenaAdverbioPrepocicion;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaAlimento;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaAmbienteYArticuloHogar;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaAnimal;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaBebida;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaColegioColor;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaCuerpoHumano;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaFruta;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaInformatica;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaJuego;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaLetraRepository;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaNaturaleza;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaNocionTemporal;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaNumero;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaPais;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaPregunta;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaPronombre;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaReligion;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaVerbo;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaVerdura;
import ProyectoLenguajeSenas.Repositorys.LenguaSenaVestimenta;

@SuppressWarnings("rawtypes")
@Component
public class ClassFactory {
	
	@Autowired
	LenguaSenaAdverbioPrepocicion adjetivoRepository;
	@Autowired
	LenguaSenaAdverbioPrepocicion adverbioPrepocicionRepository;
	@Autowired
	LenguaSenaAlimento alimentoRepository;
	@Autowired
	LenguaSenaAmbienteYArticuloHogar ambienteYArticuloRepository;
	@Autowired
	LenguaSenaAnimal animalRepository;
	@Autowired
	LenguaSenaBebida bebidaRepository;
	@Autowired
	LenguaSenaColegioColor colegioColorRepository;
	@Autowired
	LenguaSenaCuerpoHumano cuerpoHumanoRepository;
	@Autowired
	LenguaSenaFruta frutaRepository;
	@Autowired
	LenguaSenaInformatica informaticaRepository;
	@Autowired
	LenguaSenaJuego juegoRepository;
	@Autowired
	LenguaSenaLetraRepository letraRepository;
	@Autowired
	LenguaSenaNaturaleza naturalezaRepository;
	@Autowired
	LenguaSenaNocionTemporal nocionTemporalRepository;
	@Autowired
	LenguaSenaNumero numeroRepository;
	@Autowired
	LenguaSenaPais paisRepository;
	@Autowired
	LenguaSenaPregunta preguntaRepository;
	@Autowired
	LenguaSenaPronombre pronombreRepository;
	@Autowired
	LenguaSenaReligion religionRepository;
	@Autowired
	LenguaSenaVerbo verboRepository;
	@Autowired
	LenguaSenaVerdura verduraRepository;
	@Autowired
	LenguaSenaVestimenta vestimentaRepository;
	
	public ClassFactory() {
	}



	public MongoRepository returnClassLenguaSordo(String categoria){
		switch (categoria) {
		case LenguaSordoConstants.ADJETIVO:
			return adjetivoRepository;
		case LenguaSordoConstants.ADVERBIO_PREPOCICION:
			return adverbioPrepocicionRepository;
		case LenguaSordoConstants.ALIMENTO:
			return alimentoRepository;
		case LenguaSordoConstants.AMBIENTE_ARTICULO_HOGAR:
			return ambienteYArticuloRepository;
		case LenguaSordoConstants.ANIMAL:
			return animalRepository;
		case LenguaSordoConstants.BEBIDA:
			return bebidaRepository;
		case LenguaSordoConstants.COLEGIO_COLOR:
			return colegioColorRepository;
		case LenguaSordoConstants.CUERPO_HUMANO:
			return cuerpoHumanoRepository;
		case LenguaSordoConstants.FRUTA:
			return frutaRepository;
		case LenguaSordoConstants.INFORMATICA:
			return informaticaRepository;
		case LenguaSordoConstants.JUEGO:
			return juegoRepository;
		case LenguaSordoConstants.LETRA:
			return letraRepository;
		case LenguaSordoConstants.NATURALEZA:
			return naturalezaRepository;
		case LenguaSordoConstants.NOCION_TEMPORAL:
			return nocionTemporalRepository;
		case LenguaSordoConstants.NUMERO:
			return numeroRepository;
		case LenguaSordoConstants.PAIS:
			return paisRepository;
		case LenguaSordoConstants.PREGUNTA:
			return preguntaRepository;
		case LenguaSordoConstants.PRONOMBRE:
			return pronombreRepository;
		case LenguaSordoConstants.RELIGION:
			return religionRepository;
		case LenguaSordoConstants.VERBO:
			return verboRepository;
		case LenguaSordoConstants.VERDURA:
			return verduraRepository;
		case LenguaSordoConstants.VESTIMENTA:
			return vestimentaRepository;
		default:
			return null;
		}
	}
	
}

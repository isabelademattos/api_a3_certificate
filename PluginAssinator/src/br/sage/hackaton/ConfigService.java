/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sage.hackaton;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class ConfigService {

	private static InputStream defaultConfig(String name, String library) 
			throws UnsupportedEncodingException {
		StringBuilder conf = new StringBuilder();
		conf.append("name = ")
			.append(name)
			.append("\n\r")
			.append("library = ")
			.append(library)
			.append("\n\r")
			.append("showInfo = true");
		return new ByteArrayInputStream(conf.toString().getBytes("UTF-8")); 
	}

	/**
	 * Compatível com:
	 * Cartão SafeWeb - Serasa Experian
	 * Leitor SCR 3310;
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static InputStream leitorSCR3310() throws UnsupportedEncodingException {
		return defaultConfig("SafeWeb", "c:/windows/system32/cmp11.dll");
	}

	/**
	 * Compatível com:
	 * eToken Pro - Certisign
	 * Token Laranja e Azul;
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static InputStream tokenAladdin() throws UnsupportedEncodingException {
		return defaultConfig("eToken", "c:/windows/system32/eTpkcs11.dll");
	}

	/**
	 * Compatível com:
	 * Cartão Certisign - Leitor GemPC Twin;
	 * Cartão Serasa - Leitor Perto;
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static InputStream leitorGemPC_Perto() throws UnsupportedEncodingException {
		return defaultConfig("SmartCard", "c:/windows/system32/aetpkss1.dll");
	}

}


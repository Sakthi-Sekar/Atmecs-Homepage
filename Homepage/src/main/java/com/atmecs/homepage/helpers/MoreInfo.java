package com.atmecs.homepage.helpers;

import org.openqa.selenium.By;

import com.atmecs.homepage.utils.PageActions;
import com.atmecs.homepage.utils.ValidateTestResult;

public class MoreInfo extends ExploreNow {
	ExploreNow explore = new ExploreNow();

	public void ClickOnMoreInfoaiml() {
		Xpath = read.readPropertiesFile("loc.moreinfo.ai/ml.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	public void ValidateTitleAiml() {
		Xpath = read.readPropertiesFile("loc.validate.title.ai/ml.xpath");
		String aiml = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(aiml, "valueaiml", "Not found");
		log.info("Artificial Intelligence / Machine Learning");
	}

	public void ValidateBreadcrumbAiml() {
		Xpath = read.readPropertiesFile("loc.breadcrumb.aiml.xpath");
		String aimlbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(aimlbreadcrumb, "breadcrumbaiml", "Not found");
		log.info("Home › Services › Digital Life › Artificial Intelligence / Machine Learning");
		explore.ClickOnHome();

	}

	public void ClickOnMoreInfoarvr() {
		Xpath = read.readPropertiesFile("loc.moreinfo.ai/vr.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	public void ValidateTitleArvr() {
		Xpath = read.readPropertiesFile("loc.validate.arvr.xpath");
		String arvr = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(arvr, "valuearvr", "Not found");
		log.info("Augmented Reality / Virtual Reality");
	}

	public void ValidateBreadcrumbArvr() {
		Xpath = read.readPropertiesFile("loc.breadcrumb.aivr.xpath");
		String aivrbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(aivrbreadcrumb, "breadcrumbarvr", "Not found");
		log.info("Home › Services › Digital Life › Augmented Reality / Virtual Reality");
		explore.ClickOnHome();

	}

	public void ClickOnMoreInfoiot() {
		Xpath = read.readPropertiesFile("loc.moreinfo.iot.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	public void ValidateTitleIot() {
		Xpath = read.readPropertiesFile("loc.validate.iot.xpath");
		String iot = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(iot, "valueiot", "Not found");
		log.info("Internet of Things");
	}

	public void ValidateBreadcrumbIot() {
		Xpath = read.readPropertiesFile("loc.breadcrumbiot.xpath");
		String iotbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(iotbreadcrumb, "breadcrumbiot", "Not found");
		log.info("Home › Services › Digital Life › Internet of Things");
		explore.ClickOnHome();

	}

	public void ClickOnMoreInforpac() {
		Xpath = read.readPropertiesFile("loc.moreinfo.rpac.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	public void ValidateTitleRpac() {
		Xpath = read.readPropertiesFile("loc.validate.rpac.xpath");
		String iot = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(iot, "valuerpac", "Not found");
		log.info("Robotic Process Automation & ChatBOTs");
	}

	public void ValidateBreadcrumbRpac() {
		Xpath = read.readPropertiesFile("loc.breadcrumbrpac.xpath");
		String rpacbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(rpacbreadcrumb, "breadcrumbrpac", "Not found");
		log.info("Home › Services › Digital Life › Robotic Process Automation & ChatBOTs");
		explore.ClickOnHome();

	}

	public void ClickOnMoreInfobc() {
		Xpath = read.readPropertiesFile("loc.moreinfo.bloackchain.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	public void ValidateTitleBc() {
		Xpath = read.readPropertiesFile("loc.validate.blockchain.xpath");
		String bc = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(bc, "valuebc", "Not found");
		log.info("Block Chain");
	}

	public void ValidateBreadcrumbBc() {
		Xpath = read.readPropertiesFile("loc.breadcrumb.bc.xpath");
		String bcbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(bcbreadcrumb, "breadcrumbbc", "Not found");
		log.info("Home › Services › Digital Life › Blockchain");
		explore.ClickOnHome();
	}
}

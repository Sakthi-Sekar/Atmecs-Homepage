package com.atmecs.homepage.testscript;

import org.testng.annotations.Test;

import com.atmecs.homepage.helpers.ExploreNow;
import com.atmecs.homepage.helpers.MoreInfo;
import com.atmecs.homepage.testbase.InvokeBrowser;

public class HomePage extends InvokeBrowser {
	ExploreNow explore = new ExploreNow();
	MoreInfo info = new MoreInfo();

	@Test(priority = 2)
	public void homePage() {
		explore.ClickOnExploreNow();
		explore.ClickOnHome();
	}

	@Test(priority = 3)
	public void moreInfo() {
		info.ClickOnMoreInfoaiml();
		info.ValidateTitleAiml();
		info.ValidateBreadcrumbAiml();
		info.ClickOnMoreInfoarvr();
		info.ValidateTitleArvr();
		info.ValidateBreadcrumbArvr();
		info.ClickOnMoreInfoiot();
		info.ValidateTitleIot();
		info.ValidateBreadcrumbIot();
		info.ClickOnMoreInforpac();
		info.ValidateTitleRpac();
		info.ValidateBreadcrumbRpac();
		info.ClickOnMoreInfobc();
		info.ValidateTitleBc();
		info.ValidateBreadcrumbBc();
		
		driver.quit();
	}
}

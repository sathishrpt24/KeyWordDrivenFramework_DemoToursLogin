package DriverEngine;

import java.io.IOException;

import Config.ActionKeyWords;
import Utility.ExcelUtils;

public class DriverScript {

	public static void main(String[] args) throws IOException {

		String path = "E:\\KeyWordDrivenTesting\\kdt\\src\\main\\java\\DataEngine\\DataEngine.xlsx";

		ExcelUtils.setExcelPath(path, "TestSteps");

		for (int rownum = 1; rownum < 10; rownum++) {

			String ActionKeyWord = ExcelUtils.cellData(rownum, 3);

			if (ActionKeyWord.equals("open_browser")) {
				ActionKeyWords.open_browser();

			} else if (ActionKeyWord.equals("navigate")) {
				ActionKeyWords.navigate();
			} else if (ActionKeyWord.equals("enter_uname")) {
				ActionKeyWords.enter_uname();
			} else if (ActionKeyWord.equals("enter_pwd")) {
				ActionKeyWords.enter_pwd();
			} else if (ActionKeyWord.equals("click")) {
				ActionKeyWords.click();
			} else if (ActionKeyWord.equals("getpage_tittle")) {
				ActionKeyWords.click();
			} else if (ActionKeyWord.equals("quit")) {
				ActionKeyWords.quit();
			}

		}

}

}

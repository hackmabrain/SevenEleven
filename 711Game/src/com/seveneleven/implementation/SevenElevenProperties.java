package com.seveneleven.implementation;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.omg.CORBA.Environment;
 
/**
* @author Crunchify.com
*
*/
 
public class SevenElevenProperties {
	
	
	final static String PROP_FILE_NAME="config.properties";
	
	private String mGameSummaryHelperText;
	private String mGameCommandsHelperText;
	private String mGameCommandHELPHelperText;
	private String mGameCommandADDHelperText;
	private String mGameCommandSPEEDHelperText;
	private String mGameCommandMAXHelperText;
	private String mGameCommandSTARTHelperText;
	private String mGameCommandsHeadingHelperText;
	private String mGameHeadingHelperText;
	
	/**
	 * @return the mGameHeadingHelperText
	 */
	public String getGameHeadingHelperText() {
		return mGameHeadingHelperText;
	}

	/**
	 * @return the mGameSummaryHelperText
	 */
	public String getGameSummaryHelperText() {
		return mGameSummaryHelperText;
	}

	/**
	 * @return the mGameCommandsHelperText
	 */
	public String getGameCommandsHelperText() {
		return mGameCommandsHelperText;
	}

	/**
	 * @return the mGameCommandHELPHelperText
	 */
	public String getGameCommandHELPHelperText() {
		return mGameCommandHELPHelperText;
	}

	/**
	 * @return the mGameCommandADDHelperText
	 */
	public String getGameCommandADDHelperText() {
		return mGameCommandADDHelperText;
	}

	/**
	 * @return the mGameCommandSPEEDHelperText
	 */
	public String getGameCommandSPEEDHelperText() {
		return mGameCommandSPEEDHelperText;
	}

	/**
	 * @return the mGameCommandMAXHelperText
	 */
	public String getGameCommandMAXHelperText() {
		return mGameCommandMAXHelperText;
	}

	/**
	 * @return the mGameCommandSTARTHelperText
	 */
	public String getGameCommandSTARTHelperText() {
		return mGameCommandSTARTHelperText;
	}

	/**
	 * @return the mGameCommandsHeadingHelperText
	 */
	public String getGameCommandsHeadingHelperText() {
		return mGameCommandsHeadingHelperText;
	}

	/**
	 * @param pGameHeadingHelperText the mGameHeadingHelperText to set
	 */
	public void setGameHeadingHelperText(String pGameHeadingHelperText) {
		this.mGameHeadingHelperText = pGameHeadingHelperText;
	}

	/**
	 * @param pGameSummaryHelperText the mGameSummaryHelperText to set
	 */
	public void setGameSummaryHelperText(String pGameSummaryHelperText) {
		this.mGameSummaryHelperText = pGameSummaryHelperText;
	}

	/**
	 * @param pGameCommandsHelperText the mGameCommandsHelperText to set
	 */
	public void setGameCommandsHelperText(String pGameCommandsHelperText) {
		this.mGameCommandsHelperText = pGameCommandsHelperText;
	}

	/**
	 * @param pGameCommandHELPHelperText the mGameCommandHELPHelperText to set
	 */
	public void setGameCommandHELPHelperText(String pGameCommandHELPHelperText) {
		this.mGameCommandHELPHelperText = pGameCommandHELPHelperText;
	}

	/**
	 * @param pGameCommandADDHelperText the mGameCommandADDHelperText to set
	 */
	public void setGameCommandADDHelperText(String pGameCommandADDHelperText) {
		this.mGameCommandADDHelperText = pGameCommandADDHelperText;
	}

	/**
	 * @param pGameCommandSPEEDHelperText the mGameCommandSPEEDHelperText to set
	 */
	public void setmGameCommandSPEEDHelperText(String pGameCommandSPEEDHelperText) {
		this.mGameCommandSPEEDHelperText = pGameCommandSPEEDHelperText;
	}

	/**
	 * @param pGameCommandMAXHelperText the mGameCommandMAXHelperText to set
	 */
	public void setGameCommandMAXHelperText(String pGameCommandMAXHelperText) {
		this.mGameCommandMAXHelperText = pGameCommandMAXHelperText;
	}

	/**
	 * @param pGameCommandSTARTHelperText the mGameCommandSTARTHelperText to set
	 */
	public void setGameCommandSTARTHelperText(String pGameCommandSTARTHelperText) {
		this.mGameCommandSTARTHelperText = pGameCommandSTARTHelperText;
	}

	/**
	 * @param pGameCommandsHeadingHelperText the mGameCommandsHeadingHelperText to set
	 */
	public void setGameCommandsHeadingHelperText(
			String pGameCommandsHeadingHelperText) {
		this.mGameCommandsHeadingHelperText = pGameCommandsHeadingHelperText;
	}


 
    public SevenElevenProperties() throws IOException {
 
        Properties prop = new Properties();
 
        FileReader reader=new FileReader(PROP_FILE_NAME);
        prop.load(reader);
        if (reader == null) {
            throw new FileNotFoundException("property file '" + PROP_FILE_NAME + "' not found in the classpath");
        }
 
 
        // get the property value and print it out
        mGameHeadingHelperText = prop.getProperty("gameHeadingHelperText");
        mGameSummaryHelperText = prop.getProperty("gameSummaryHelperText");
        mGameCommandsHelperText = prop.getProperty("gameCommandsHelperText");
        mGameCommandHELPHelperText = prop.getProperty("gameCommandHELPHelperText");
        mGameCommandADDHelperText = prop.getProperty("gameCommandADDHelperText");
        mGameCommandSPEEDHelperText = prop.getProperty("gameCommandSPEEDHelperText");
        mGameCommandMAXHelperText = prop.getProperty("gameCommandMAXHelperText");
        mGameCommandSTARTHelperText = prop.getProperty("gameCommandSTARTHelperText");
        mGameCommandsHeadingHelperText=prop.getProperty("gameCommandsHeadingHelperText");
 
    }

	    
    
}

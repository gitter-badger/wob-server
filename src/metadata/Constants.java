/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metadata;

/**
 *
 * @author anu
 */
public class Constants {
    public static final String CLIENT_VERSION = "1.00";
    public static final int TIMEOUT_SECONDS = 90;
    public static final short MAX_NUMBER_OF_PLAYERS = 2;
   
    public final static short CMSG_AUTH = 101;
    public final static short SMSG_AUTH = 201;
    
    public final static short CMSG_RACE_INIT = 501;
    public final static short SMSG_RACE_INIT = 601;
    public final static short CMSG_SDSTARTGAME = 502;
    public final static short SMSG_SDSTARTGAME = 602;
    public final static short CMSG_SDENDGAME = 503;
    public final static short SMSG_SDENDGAME = 603;
}
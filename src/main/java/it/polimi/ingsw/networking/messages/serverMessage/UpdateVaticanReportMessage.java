package it.polimi.ingsw.networking.messages.serverMessage;

import java.util.HashMap;

public class UpdateVaticanReportMessage extends ServerMessage {
    private final HashMap<Integer, Boolean> vaticanReportUpdate;

    public UpdateVaticanReportMessage(HashMap<Integer, Boolean> vaticanReportUpdate) {
        this.vaticanReportUpdate = vaticanReportUpdate;
    }

    public HashMap<Integer, Boolean> getVaticanReportUpdate() {
        return vaticanReportUpdate;
    }
}

package com.projectx.codeecho.controller;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class RoomLinkManager {
    public void RoomLinkCopy(String link){
        StringSelection sharingData = new StringSelection(link);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(sharingData,sharingData);
    }

    public String RoomLinkPaste(){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents= clipboard.getContents(clipboard);

        try{
            String pasteLink = (String)(contents.getTransferData(DataFlavor.stringFlavor));
            return pasteLink;
        }catch(UnsupportedFlavorException | IOException e){
            e.printStackTrace();
        }

        return "it's not";
    }
}

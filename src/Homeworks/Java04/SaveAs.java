package Homeworks.Java04;

import Homeworks.Java04.Applications.Notepad;
import Homeworks.Java04.Format.Doc;
import Homeworks.Java04.Format.Md;
import Homeworks.Java04.Format.TextFormat;
import Homeworks.Java04.Format.Txt;

public class SaveAs<T> {
    private T fileFormat;
    private String text;
    private String fileName;

    public SaveAs(T fileFormat, String fileName, String text) {
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText(text);
        if (fileFormat == TextFormatS.doc) {
            notes.SaveAs(fileName, new Doc());
        } else if ((fileFormat == TextFormatS.txt)) {
            notes.SaveAs(fileName, new Txt());
        } else if ((fileFormat == TextFormatS.md)) {
            notes.SaveAs(fileName, new Md());
        }
    }

}

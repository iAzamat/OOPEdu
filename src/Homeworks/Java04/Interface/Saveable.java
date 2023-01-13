package Homeworks.Java04.Interface;

import Homeworks.Java04.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

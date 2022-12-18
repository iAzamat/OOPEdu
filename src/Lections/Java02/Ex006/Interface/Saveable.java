package Lections.Java02.Ex006.Interface;

import Lections.Java02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

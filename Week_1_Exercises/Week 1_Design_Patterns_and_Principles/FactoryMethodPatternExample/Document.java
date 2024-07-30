abstract class Document {
    public abstract void open();
    public abstract void save();
}

interface WordDocument {
    void edit();
}

interface PdfDocument {
    void print();
}

interface ExcelDocument {
    void calculate();
}

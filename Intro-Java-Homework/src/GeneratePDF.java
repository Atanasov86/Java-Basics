import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class GeneratePDF {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Deck-of-Cards.pdf"));
            document.open();
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.getDefaultCell().setFixedHeight(180);
            BaseFont baseFont = BaseFont.createFont("c:/windows/fonts/times.ttf", BaseFont.IDENTITY_H, true);
            Font blackFont = new Font(baseFont, 75f, 0, BaseColor.BLACK);
            Font redFont = new Font(baseFont, 75f, 0, BaseColor.RED);
            String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",};
            char[] suits = {'\u2660', '\u2666', '\u2665', '\u2663'};
            for (int i = 0; i < cards.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    Font currentFont = j % 2 == 0 ? blackFont : redFont;
                    String currentCard = cards[i] + suits[j];
                    Paragraph paragraph = new Paragraph(currentCard, currentFont);
                    table.addCell(paragraph);
                }
            }
            document.add(table);
            document.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


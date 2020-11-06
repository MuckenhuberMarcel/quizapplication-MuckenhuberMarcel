package model;

public class QuestionCatalog {
    private Question[] questions;

    public QuestionCatalog(){
        questions = new Question[]{
                new Question("Die Sonne geht im Süden auf", false),
                new Question("Der 100-Meter Weltrekord der Männer liegt bei 9.77 Sekunden.", false),
                new Question("Der am Tiefsten gelegene Meeresgrund der Welt ist in etwa 2000 Metern tiefe.", false),
                new Question("Athen ist die Hauptstadt von Griechenland.", true),
                new Question("Die größte Insel der Welt ist Madagaskar", false),
                new Question("Die Vereinsfarben des FC Barcelona sind Blau-Rot.", true),
                new Question("Arnold Schwarzenegger hatte in allen dieser Filme eine Rolle: \"Versprochen ist versprochen\", \"Terminator\", \"Red Heat\".", true),
                new Question("Russland ist das größte Land der Erde.", true),
                new Question("Die Fußball - Europameisterschaft 2008 fand in Österreich und Kroatien statt.", false),
                new Question("Die Woche hat 6 Tage.", false)
        };
    }
}

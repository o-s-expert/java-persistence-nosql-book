package expert.os.books.persistence.nosql.music;

@MusicalInstrument(InstrumentType.PERCUSSION)
class Xylophone implements Instrument {
    @Override
    public String sound() {
        return "xylophone";
    }
}

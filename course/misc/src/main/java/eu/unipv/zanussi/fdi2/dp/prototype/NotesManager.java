package eu.unipv.zanussi.fdi2.dp.prototype;

/** Note class, example of the prototype design pattern. */
public class NotesManager {

    public enum Notes {
        HALF_QUARTER_NOTE(new Note(.5f, 0)),
        ONE_QUARTER_NOTE(new Note(1.0f, 0)),
        TWO_QUARTER_NOTE(new Note(2.0f, 0));

        private Note note;

        Notes(Note note) {
            this.note = note;
        }

        public Note getNote() {
            return note;
        }
    }

    public Note[] createDefaultMelody() {
        Note[] notes = new Note[3];
        notes[0] = Notes.HALF_QUARTER_NOTE.getNote().clone();
        notes[1] = Notes.HALF_QUARTER_NOTE.getNote().clone();
        notes[2] = Notes.HALF_QUARTER_NOTE.getNote().clone();
        return notes;
    }

}

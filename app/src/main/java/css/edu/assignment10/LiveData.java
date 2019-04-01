package css.edu.assignment10;

import java.util.List;

public class LiveData {
    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}

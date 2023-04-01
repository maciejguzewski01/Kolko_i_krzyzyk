package com.example.kolko_i_krzyzyk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/*
Napiszcie proszę prostą aplikację do gry w kółko i krzyżyk. Nie trzeba implementować sztucznej intelignecji - załóżmy, że grają dwie osoby na jednym telefonie.
Co musimy zrobić ? Poniżej prosty "plan" pisania aplikacji
	1. Tworzymy najprostszy projekt Android z jedną Activity
	2. Zastanawiamy się nad "modelem" naszej aplikacji
- w jaki sposób w kodzie możemy odwzorować sobie planszę do gry ?
- jak pamiętać kto w danym momencie ma wykonać ruch ?
	3. W stworzonej Activity zmieniamy całkowicie wygląd. Proszę zamienić LinearLayout na TableLayout i wstawić do niego 9 przycisków (3x3) oraz pole wskazujące który gracz ma teraz wykonać ruch
	4. Dla wszystkich przycisków ustawiamy listenera. Procedura obsługi naciśnięcia przycisku zmieni jego opis z domyślnego pustego na "X" lub "O"
	5. Po każdym wciśnięciu przycisku sprawdzamy czy gra się zakończyła - może się to stać gdy jeden z graczy ułoży pełną linię lub zabrakło nam pól na planszy (remis)
	6. Jeśli gra się skończyła - wyświetlamy okienko dialogowe na ekranie z informacją kto wygrał i proponujemy kolejną grę
Jeśli zdążymy, to uzupełnimy aplikację o dodatkowe elementy
	1. Wyświetlanie informacji o historii rozgrywki (ile razy wygrało O, ile razy X, ile było remisów)
	2. Zapisywanie stanu rozgrywki i historii przy wyjściu z Activity i odtworzenie go przy restarcie - zasymulujemy sobie przychodzącą rozmowę telefoniczną
Obsługę przycisku menu (np. czyszczenie historii, restart bieżącej rozgrywki)
 */
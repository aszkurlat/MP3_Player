package pl.myPlayer.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.myPlayer.mp3.MP3Song;

public class ContentPaneController implements Initializable {

    public static final String TITLE_COLUMN = "Tytuł";
    public static final String AUTHOR_COLUMN = "Autor";
    public static final String ALBUM_COLUMN = "Album";

    @FXML
    private TableView<MP3Song> contentTable;

    public TableView<MP3Song> getContentTable() {
        return contentTable;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureTable();
    }

    private void configureTable() {
        TableColumn<MP3Song, String> titleColumn = new TableColumn<MP3Song, String>(TITLE_COLUMN);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<MP3Song, String> authorColumn = new TableColumn<MP3Song, String>(AUTHOR_COLUMN);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        TableColumn<MP3Song, String> albumColumn = new TableColumn<MP3Song, String>(ALBUM_COLUMN);
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

        getContentTable().getColumns().add(titleColumn);
        getContentTable().getColumns().add(authorColumn);
        getContentTable().getColumns().add(albumColumn);
    }

}
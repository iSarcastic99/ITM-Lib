package com.example.itmlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BookOpener extends AppCompatActivity {
    String book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_opener);
        book = getIntent().getStringExtra("Bookname");
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(book + ".pdf").load();
    }
}
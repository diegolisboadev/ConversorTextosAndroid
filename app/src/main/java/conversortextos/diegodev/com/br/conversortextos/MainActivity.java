package conversortextos.diegodev.com.br.conversortextos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    //Atributos
    private Button btnPDFWord;
    private Button btnWordPDF;
    private Button btnPDFPowerPoint;
    private Button btnPowerPointPDF;
    private Button btnJuntarPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPDFWord = (Button) findViewById(R.id.btnPDFWord);
        btnWordPDF = (Button) findViewById(R.id.btnWordPDF);
        btnPDFPowerPoint = (Button) findViewById(R.id.btnPDFPowerPoint);
        btnPowerPointPDF = (Button) findViewById(R.id.btnPowerPointPDF);
        btnJuntarPDF = (Button) findViewById(R.id.btnPowerPointPDF);

        btnPDFWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link1 = new Intent(Intent.ACTION_VIEW);
                Uri pag1 = Uri.parse("http://pdf2doc.com/pt/");
                link1.setData(pag1);
                startActivity(link1);
            }
        });

        btnWordPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link2 = new Intent(Intent.ACTION_VIEW);
                Uri pag2 = Uri.parse("https://smallpdf.com/pt/word-para-pdf");
                link2.setData(pag2);
                startActivity(link2);
            }
        });

        btnPDFPowerPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link3 = new Intent(Intent.ACTION_VIEW);
                Uri pag3 = Uri.parse("https://smallpdf.com/pt/pdf-para-ppt");
                link3.setData(pag3);
                startActivity(link3);
            }
        });

        btnPowerPointPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link4 = new Intent(Intent.ACTION_VIEW);
                Uri pag4 = Uri.parse("https://smallpdf.com/pt/ppt-para-pdf");
                link4.setData(pag4);
                startActivity(link4);
            }
        });

        btnJuntarPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link5 = new Intent(Intent.ACTION_VIEW);
                Uri pag5 = Uri.parse("https://smallpdf.com/pt/juntar-pdf");
                link5.setData(pag5);
                startActivity(link5);
            }
        });

    }

}

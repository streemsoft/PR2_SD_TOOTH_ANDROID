package com.streem.sdtooth;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.streem.sdtooth.Controler.InputMask;
import com.streem.sdtooth.Controler.MonetaryMask;

public class MainAdmin extends AppCompatActivity {

    //Layout_Controle
    private ConstraintLayout menuLateral;
    private ConstraintLayout bt_dashboardGeral;
    //Modulo Consulta
    private ConstraintLayout bt_moduloConsulta;
    private ConstraintLayout mn_consulta;
    private TextView bt_NovoPac;
    private TextView bt_Anamnese;
    private TextView bt_Prontuario;
    private TextView bt_Odontograma;
    private TextView bt_Imagens;
    //Modulo Recepção
    private ConstraintLayout bt_moduloRecepcao;
    private ConstraintLayout mn_recepcao;
    private TextView bt_Consulta;
    private TextView bt_Cadastro;
    private TextView bt_Agendamento;
    private TextView bt_Financeiro;
    //Modulo Serviço
    private ConstraintLayout bt_moduloServico;
    private ConstraintLayout mn_servico;
    private TextView bt_ConsultaServ;
    private TextView bt_NovoServ;
    //Modulo Administrativo
    private ConstraintLayout bt_moduloAdministrativo;
    private ConstraintLayout mn_administrativo;
    private TextView bt_DadosClinica;
    private TextView bt_Usuarios;
    private TextView bt_Config;
    private TextView bt_Estoque;
    private TextView bt_FinanceiroAdmin;
    private TextView bt_Estatisticas;
    private TextView bt_Procedimentos;
    //==========================================================
    EditText x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);

        x = findViewById(R.id.editText);

        Button b = findViewById(R.id.button);

        x.addTextChangedListener(InputMask.mask(x,"(##)#####-####"));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText("100000.00");
                Toast.makeText(getApplicationContext(), x.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

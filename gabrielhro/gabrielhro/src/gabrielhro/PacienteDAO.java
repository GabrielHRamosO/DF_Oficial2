/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielhro;

import java.util.ArrayList;
import java.sql.*;

public class PacienteDAO extends Conexao {

    public ArrayList listaPacientes() {
        try {
            ResultSet res = this.getResultSet("SELECT * FROM PACIENTE ORDER BY NOME");
            ArrayList array = new ArrayList();
            while (res.next()) {
                Paciente pac = new Paciente();
                pac.setIdPaciente(res.getInt("IDPACIENTE"));
                pac.setNome(res.getString("NOME"));
                pac.setCpf(res.getString("CPF"));
                pac.setIdade(res.getInt("IDADE"));
                array.add(pac);
            }
            return array;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String cadastraPaciente(Paciente paciente) {
        try {
            return this.atualizarBanco("INSERT INTO PACIENTE(NOME, CPF, IDADE) VALUES ('"
                    + paciente.getNome() + "', '"
                    + paciente.getCpf() + "', "
                    + Integer.toString(paciente.getIdade()) + ")");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String excluiPaciente(int idPaciente) {
        try {
            return this.atualizarBanco("DELETE FROM PACIENTE WHERE IDPACIENTE = " + Integer.toString(idPaciente));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String atualizaPaciente(Paciente paciente) {
        try {
            return this.atualizarBanco("UPDATE PACIENTE SET NOME = '" + paciente.getNome()
                    + "' , CPF = '" + paciente.getCpf()
                    + "' , IDADE = " + Integer.toString(paciente.getIdade())
                    + " WHERE IDPACIENTE = " + Integer.toString(paciente.getIdPaciente()));
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielhro;

import java.util.ArrayList;
import java.sql.*;

public class MedicoDAO extends Conexao {

    public String atualizaMedico(Medico medico) {
        try {
            return this.atualizarBanco("UPDATE MEDICO SET NOME = '" + medico.getNome()
                    + "' , ESPECIALIDADE = " + Integer.toString(medico.getEspecialidade())
                    + " , CRM = " + Integer.toString(medico.getCrm())
                    + " , CPF = '" + medico.getCpf()
                    + "' WHERE IDMEDICO = " + Integer.toString(medico.getIdMedico()));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String cadastraMedico(Medico medico) {
        try {
            return this.atualizarBanco("INSERT INTO MEDICO(NOME, ESPECIALIDADE, CRM, CPF) VALUES ('"
                    + medico.getNome() + "', "
                    + Integer.toString(medico.getEspecialidade()) + ", "
                    + Integer.toString(medico.getCrm()) + ", '"
                    + medico.getCpf() + "')");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public ArrayList listaMedicos() {
        try {
            ResultSet res = this.getResultSet("SELECT * FROM MEDICO ORDER BY NOME");
            ArrayList array = new ArrayList();
            while (res.next()) {
                Medico med = new Medico();
                med.setIdMedico(res.getInt("IDMEDICO"));
                med.setNome(res.getString("NOME"));
                med.setEspecialidade(res.getInt("ESPECIALIDADE"));
                med.setCrm(res.getInt("CRM"));
                med.setCpf(res.getString("CPF"));
                array.add(med);
            }
            return array;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String excluiMedico(int idMedico) {
        try {
            return this.atualizarBanco("DELETE FROM MEDICO WHERE IDMEDICO = " + Integer.toString(idMedico));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielhro;

import java.util.ArrayList;
import java.sql.*;

public class ConsultaDAO extends Conexao {

    public String atualizaConsulta(Consulta consulta) {
        try {
            return this.atualizarBanco("UPDATE CONSULTA SET IDMEDICO = " + Integer.toString(consulta.getIdMedico())
                    + " , IDPACIENTE = " + Integer.toString(consulta.getIdPaciente())
                    + " , CONVENIO = '" + consulta.getConvenio()
                    + "' WHERE IDCONSULTA = " + Integer.toString(consulta.getIdConsulta()));
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String cadastraConsulta(Consulta consulta) {
        try {
            return this.atualizarBanco("INSERT INTO CONSULTA(IDMEDICO, IDPACIENTE, CONVENIO) VALUES ("
                    + Integer.toString(consulta.getIdMedico()) + ", "
                    + Integer.toString(consulta.getIdPaciente()) + ", '"
                    + consulta.getConvenio() + "')");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
     public ArrayList listaConsultas() {
        try {
            ArrayList array = new ArrayList();
            ResultSet res = this.getResultSet("select idconsulta, concat(med.idmedico, \"#\", med.nome) as medico, concat(pac.idpaciente, \"#\", pac.nome) as paciente, convenio from consulta con "
                    + " left join medico med on med.idmedico = con.idmedico "
                    + " left join paciente pac on pac.idpaciente = con.idpaciente "
                    + " order by convenio");
            while (res.next()) {
                ConsultaTabela consulta = new ConsultaTabela();
                consulta.setIdConsulta(res.getInt("idconsulta"));
                consulta.setMedico(res.getString("medico"));
                consulta.setPaciente(res.getString("paciente"));
                consulta.setConvenio(res.getString("convenio"));
                array.add(consulta);
            }
            return array;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String excluiConsulta(int idConsulta) {
        try {
            return this.atualizarBanco("DELETE FROM CONSULTA WHERE IDCONSULTA = " + Integer.toString(idConsulta));
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administração
 */
public class Database {

    public static Connection Connect() {
        String url = "jdbc:postgresql://localhost:5432/db_prefeitura";
        String usuario = "prefeitura";
        String senha = "1234";

        String driverName = "org.postgresql.Driver";

        Connection conn = null;
        try {
            Class.forName(driverName).newInstance();
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public int buscaUltimoCodigo() throws SQLException {

        String stm = "select id from aluno order by id desc limit 1";
        int resp = 0;
        PreparedStatement pst;
        ResultSet rs = null;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (rs.next()) {
            resp = rs.getInt("id");
        }
        return resp;
    }

    public boolean cadastraAluno(Aluno pessoa) {
        String stm = "INSERT INTO aluno (dataCadastro,nome,cpf,rg,orgaoExpedidor,rua,numero,bairro,complemento,"
                + "municipio,estado,cep,email,telFixo,telMovel,instituicao,curso,periodo,dataNascimento,segunda,terca,"
                + "quarta,quinta,sexta,sabado,ativo) VALUES (?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pst;
        //String dataTemp[] = pessoa.getDataCadastro().split("/");
        //String dataTemp2 = dataTemp[2] + "-" + dataTemp[1] + "-" + dataTemp[0];

        java.util.Date dateTime = new java.util.Date();
        Timestamp timestamp = new Timestamp((dateTime).getTime());

        Connection conn = Database.Connect();

        try {
            pst = conn.prepareStatement(stm);
            pst.setTimestamp(1, timestamp);
            pst.setString(2, pessoa.getNome());
            pst.setString(3, pessoa.getCpf());
            pst.setString(4, pessoa.getRg());
            pst.setString(5, pessoa.getOrgaoExpedidor());
            pst.setString(6, pessoa.getRua());
            pst.setString(7, pessoa.getNumero());
            pst.setString(8, pessoa.getBairro());
            pst.setString(9, pessoa.getComplemento());
            pst.setString(10, pessoa.getMunicipio());
            pst.setString(11, pessoa.getEstado());
            pst.setString(12, pessoa.getCep());
            pst.setString(13, pessoa.getEmail());
            pst.setString(14, pessoa.getTelefoneFixo());
            pst.setString(15, pessoa.getTelefoneMovel());
            pst.setString(16, pessoa.getInstituicao());
            pst.setString(17, pessoa.getCurso());
            pst.setString(18, pessoa.getPeriodo());
            pst.setString(19, pessoa.getDataNascimento());
            pst.setBoolean(20, pessoa.isSegunda());
            pst.setBoolean(21, pessoa.isTerca());
            pst.setBoolean(22, pessoa.isQuarta());
            pst.setBoolean(23, pessoa.isQuinta());
            pst.setBoolean(24, pessoa.isSexta());
            pst.setBoolean(25, pessoa.isSabado());
            pst.setBoolean(26, pessoa.isAtivo());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet buscaAlunos(String nome) {
        String stm = "select id,nome, cpf,ativo from aluno where nome ilike '%" + nome + "%' order by nome";
        PreparedStatement pst;
        ResultSet rs = null;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet BuscaAlunoAtualizar(String id) {
        ResultSet rs = null;
        String stm = "select * from aluno where id = " + id + "";
        PreparedStatement pst;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public boolean atualizaAluno(Aluno pessoa, String id) {
        PreparedStatement pst = null;
        String stm = "UPDATE aluno set nome = ?,cpf = ?,rg = ?,orgaoExpedidor = ?,rua = ?,numero = ?,bairro = ?,complemento = ?,"
                + "municipio = ?,estado = ?,cep = ?,email = ?,telFixo = ?,telMovel = ?,instituicao = ?,curso = ?,periodo = ?,dataNascimento = ?,"
                + "segunda = ?,terca = ?,quarta = ?,quinta = ?,sexta = ?,sabado = ?, ativo = ?  where id = " + id + "";

        try {
            pst = this.Connect().prepareStatement(stm);
            pst.setString(1, pessoa.getNome());
            pst.setString(2, pessoa.getCpf());
            pst.setString(3, pessoa.getRg());
            pst.setString(4, pessoa.getOrgaoExpedidor());
            pst.setString(5, pessoa.getRua());
            pst.setString(6, pessoa.getNumero());
            pst.setString(7, pessoa.getBairro());
            pst.setString(8, pessoa.getComplemento());
            pst.setString(9, pessoa.getMunicipio());
            pst.setString(10, pessoa.getEstado());
            pst.setString(11, pessoa.getCep());
            pst.setString(12, pessoa.getEmail());
            pst.setString(13, pessoa.getTelefoneFixo());
            pst.setString(14, pessoa.getTelefoneMovel());
            pst.setString(15, pessoa.getInstituicao());
            pst.setString(16, pessoa.getCurso());
            pst.setString(17, pessoa.getPeriodo());
            pst.setString(18, pessoa.getDataNascimento());
            pst.setBoolean(19, pessoa.isSegunda());
            pst.setBoolean(20, pessoa.isTerca());
            pst.setBoolean(21, pessoa.isQuarta());
            pst.setBoolean(22, pessoa.isQuinta());
            pst.setBoolean(23, pessoa.isSexta());
            pst.setBoolean(24, pessoa.isSabado());
            pst.setBoolean(25, pessoa.isAtivo());
            pst.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas ao conectar ao banco, contate o suporte");
            return false;
        }

    }

    public int quantosAlunos() throws SQLException {
        ResultSet rs = null;
        int resp = 0;
        String stm = "SELECT COUNT(*) as qtd FROM aluno";
        PreparedStatement pst;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (rs.next()) {
            resp = Integer.parseInt(rs.getString("qtd"));
        }
        return resp;
    }

    public boolean todosInativos() {
        String stm = "update aluno set ativo = false";
        PreparedStatement pst;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int buscaUltimoCodigoPasse() throws SQLException {

        String stm = "select id from passe order by id desc limit 1";
        int resp = 0;
        PreparedStatement pst;
        ResultSet rs = null;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (rs.next()) {
            resp = rs.getInt("id");
        }
        return resp;
    }

    public boolean inserePasse(Passe passe) throws ParseException {
        String stm = "INSERT INTO passe (id_aluno,dataRetirada,dataInicio,dataFinal,aluno,origem,"
                + "destino,responsavel,quantidade,ativo,curso) VALUES (?,?,?,?,?,?,"
                + "?,?,?,?,?)";

        PreparedStatement pst;

        String dataTemp[] = passe.getDataRetirada().split("/");
        String dataTemp2 = dataTemp[2] + "-" + dataTemp[1] + "-" + dataTemp[0];

        String dataTemp3[] = passe.getDataInicio().split("/");
        String dataTemp4 = dataTemp3[2] + "-" + dataTemp3[1] + "-" + dataTemp3[0];

        String dataTemp5[] = passe.getDataFim().split("/");
        String dataTemp6 = dataTemp5[2] + "-" + dataTemp5[1] + "-" + dataTemp5[0];

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = dateFormat.parse(dataTemp2);
        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate1 = dateFormat.parse(dataTemp4);
        Timestamp timestamp1 = new java.sql.Timestamp(parsedDate1.getTime());

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate2 = dateFormat.parse(dataTemp6);
        Timestamp timestamp2 = new java.sql.Timestamp(parsedDate2.getTime());

        Connection conn = Database.Connect();

        try {
            pst = conn.prepareStatement(stm);
            pst.setInt(1, passe.getId_aluno());
            pst.setTimestamp(2, timestamp);
            pst.setTimestamp(3, timestamp1);
            pst.setTimestamp(4, timestamp2);
            pst.setString(5, passe.getAluno());
            pst.setString(6, passe.getOrigem());
            pst.setString(7, passe.getDestino());
            pst.setString(8, passe.getResponsavel());
            pst.setInt(9, passe.getQuantidade());
            pst.setBoolean(10, passe.isAtivo());
            pst.setString(11,passe.getCurso());
            pst.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet relatorioAluno(int aluno, String dataInicio, String dataFinal) {
        ResultSet rs = null;

        String stm = "select t.id_aluno ,t.id, s.nome, t.quantidade, t.origem, t.destino, "
                + "t.dataInicio,t.dataRetirada, t.dataFinal from passe t join aluno s on (t.id_aluno = s.id) "
                + "where t.id_aluno = " + aluno + " and datainicio >= '" + dataInicio + "' and dataFinal "
                + "<= '" + dataFinal + "'";

        PreparedStatement pst;

        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet relatorioInstituicao(String instituicao, String dataInicio, String dataFinal) {
        ResultSet rs = null;
            String stm = "select sum(quantidade),origem, destino,aluno from passe where destino = '" + instituicao + "'"
                    + "and datainicio >= '" + dataInicio + "' and datafinal <= '" + dataFinal + "' group by id_aluno,destino,origem, aluno ";
        PreparedStatement pst;

        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet relatorioData (String dataInicio, String dataFinal){
        ResultSet rs = null;
        String stm = "select aluno,sum(quantidade),origem, destino from passe where dataRetirada >= '"+dataInicio+"' and dataRetirada <= '"+dataFinal+"'  group by id_aluno,destino,origem, aluno order by aluno\n" +
"";
        PreparedStatement pst;

        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }

    public ResultSet buscaAlunosInativos() {
        ResultSet rs = null;
        String stm = "select * from (select distinct on (id_aluno) id_aluno, aluno, dataRetirada from passe order by id_aluno, dataRetirada desc) n1 where n1.dataRetirada < now() - '3 months'::interval";
        PreparedStatement pst;
        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    
    //
    public ResultSet BuscaAlunosCurso(String curso, String dataInicio, String dataFim) {
         ResultSet rs = null;
            String stm = "select sum(quantidade) as qtd,aluno,origem,destino,curso from passe where curso ilike '%"+curso+"%' and dataRetirada >= '"+dataInicio+"' and dataRetirada <= '"+dataFim+"' group by aluno,origem,destino,curso order by aluno";
        PreparedStatement pst;
        System.out.println("stm: "+stm);

        Connection conn = Database.Connect();
        try {
            pst = conn.prepareStatement(stm);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}

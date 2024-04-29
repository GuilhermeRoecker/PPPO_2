package Banco_de_Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Banco_de_Dados.model.cliente;

public class clienteService {

    public static int insereCliente(cliente c) {
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "INSERT INTO cliente (nome,idade,sexo,cidade) values(?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setInt(2, c.getIdade());
            pr.setString(3, c.getSexo());
            pr.setInt(4, c.getCidade().getId());
            int total = pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int alteraCidade(cliente c) {
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "update cliente set nome=?, idade=?, sexo=?, cidade=? where id=?";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setInt(2, c.getIdade());
            pr.setString(3, c.getSexo());
            pr.setInt(4, c.getCidade().getId());
            pr.setInt(5, c.getId());
            int total = pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int excluiCliente(cliente c) {
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "delete from cliente where id=?";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, c.getId());
            int total = pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static ArrayList<cliente> listAll() {

        ArrayList<cliente> lista = new ArrayList<cliente>();

        try {
            String sql = "select * from cliente";
            Connection conn = conexao.conectaMySql();
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                cliente c = new cliente();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("Nome"));
                c.setSexo(rs.getString("Sexo"));
                c.setIdade(rs.getInt("Idade"));
                c.setCidade(cidadeService.findById(rs.getInt("cidade")));
                lista.add(c);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static int limpaTblCliente() {
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "delete from cliente where id > 0";
            PreparedStatement pr = conn.prepareStatement(sql);
            int total = pr.executeUpdate();
            sql = "Alter table cliente auto_increment = 0";
            pr = conn.prepareStatement(sql);
            pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}

package Banco_de_Dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Banco_de_Dados.model.cidade;

public class cidadeService {
    
    public static int insereCidade(cidade c){
        try {

            Connection conn = conexao.conectaMySql();

            String sql = "INSERT INTO cidade (nome,uf) values(?,?)";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setString(2, c.getUf());
            int total = pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


    public static int alteraCidade(cidade c){
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "update cidade set nome=?, uf=? where id=?";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, c.getNome());
            pr.setString(2, c.getUf());
            pr.setInt(3, c.getId());
            int total = pr.executeUpdate();
            conn.close();
            return total;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int excluiCidade(cidade c){
        try {
            Connection conn = conexao.conectaMySql();

            String sql = "delete from cidade where id=?";
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

    public static ArrayList<cidade> listAll(){
        ArrayList <cidade> lista = new ArrayList<cidade>();
        try{
            String sql = "select * from cidade";
            Connection conn = conexao.conectaMySql();
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                cidade c = new cidade();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setUf(rs.getString("uf"));
                lista.add(c); 
            }
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }

}

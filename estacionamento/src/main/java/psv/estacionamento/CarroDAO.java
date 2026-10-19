package psv.estacionamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    // Cadastrar carro
    public boolean cadastrar(CarroBean carro) {
        String sql = "INSERT INTO carro (placa, cor, descricao) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, carro.getPlaca());
            comando.setString(2, carro.getCor());
            comando.setString(3, carro.getDescricao());

            comando.executeUpdate();
            return true;

        } catch (SQLException erro) {
            System.out.println("Erro ao cadastrar carro: " + erro.getMessage());
            return false;
        }
    }

    // Alterar carro
    public boolean alterar(CarroBean carro) {
        String sql = "UPDATE carro SET cor = ?, descricao = ? WHERE placa = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, carro.getCor());
            comando.setString(2, carro.getDescricao());
            comando.setString(3, carro.getPlaca());

            return comando.executeUpdate() > 0;

        } catch (SQLException erro) {
            System.out.println("Erro ao alterar carro: " + erro.getMessage());
            return false;
        }
    }

    // Excluir carro pela placa
    public boolean excluir(String placa) {
        String sql = "DELETE FROM carro WHERE placa = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, placa);

            return comando.executeUpdate() > 0;

        } catch (SQLException erro) {
            System.out.println("Erro ao excluir carro: " + erro.getMessage());
            return false;
        }
    }

    // Listar todos os carros
    public List<CarroBean> listar() {
        List<CarroBean> carros = new ArrayList<>();

        String sql = "SELECT placa, cor, descricao FROM carro";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql);
             ResultSet resultado = comando.executeQuery()) {

            while (resultado.next()) {
                CarroBean carro = new CarroBean();

                carro.setPlaca(resultado.getString("placa"));
                carro.setCor(resultado.getString("cor"));
                carro.setDescricao(resultado.getString("descricao"));

                carros.add(carro);
            }

        } catch (SQLException erro) {
            System.out.println("Erro ao listar carros: " + erro.getMessage());
        }

        return carros;
    }
}

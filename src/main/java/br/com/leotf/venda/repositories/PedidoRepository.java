
package br.com.leotf.venda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leotf.venda.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
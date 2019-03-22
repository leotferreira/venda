package br.com.leotf.venda.services;


import org.springframework.mail.SimpleMailMessage;

import br.com.leotf.venda.domain.Cliente;
import br.com.leotf.venda.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

		
}

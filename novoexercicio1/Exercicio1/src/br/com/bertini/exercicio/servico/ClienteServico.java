package br.com.bertini.exercicio.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.bertini.exercicio.dominio.Cliente;

public class ClienteServico {
	
	public List<Cliente> buscarClientePorIdadeExata(List<Cliente> listaCliente, Integer idade) {

		List<Cliente> listaRetorno = new ArrayList<Cliente>();

		for (Cliente cliente : listaCliente) {

			if (cliente.getIdade().intValue() == idade.intValue()) {

				listaRetorno.add(cliente);

			}

		}

		return listaRetorno;

	}

	public List<Cliente> buscarClientePorMaioridade(List<Cliente> listaCliente, Boolean maiorIdade) {

		List<Cliente> listaRetornoMaiorIdade = new ArrayList<Cliente>();

		for (Cliente cliente : listaCliente) {

			if (maiorIdade && cliente.getIdade().intValue() > 18) {
				listaRetornoMaiorIdade.add(cliente);
			} else if (!maiorIdade && cliente.getIdade().intValue() < 18) {
				listaRetornoMaiorIdade.add(cliente);
			}
		}

		return listaRetornoMaiorIdade;
	}

	public List<Cliente> buscarClientePorProfissao(List<Cliente> listaCliente, String profissao) {

		List<Cliente> listaRetornoProfissao = new ArrayList<Cliente>();

		for (Cliente cliente : listaCliente) {

			if (cliente.getProfissao().equals(profissao)) {
				listaRetornoProfissao.add(cliente);
			}
		}

		return listaRetornoProfissao;
	}

	public List<Cliente> buscarClientePorProfissao(List<Cliente> listaCliente, List<String> listaProfissao) {

		List<Cliente> listaRetornoProfissao2 = new ArrayList<Cliente>();

		for (Cliente cliente : listaCliente) {

			if (listaProfissao.contains(cliente.getProfissao())) {
				listaRetornoProfissao2.add(cliente);
			}
		}

		return listaRetornoProfissao2;
	}

	public void imprimirListaCliente(String mensagemIformativa, List<Cliente> listaCliente) {
		System.out.println(mensagemIformativa);
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente);
		
		}
	}
}

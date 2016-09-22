package models;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import BusinessDelegator.ClientDelegator;
import Entities.Client;

public class ClientsModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Client> clients;
	String[] entete = { "Nom", "Responsable", "Num Tel" };

	public ClientsModel() {
		clients = ClientDelegator.doFindAllClients();
	}

	// public ClientsModel(Integer id){
	// clients
	// }

	@Override
	public int getRowCount() {
		return clients.size();
	}

	@Override
	public int getColumnCount() {
		return entete.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: {
			return clients.get(rowIndex).getName();
		}
		case 1: {
			return clients.get(rowIndex).getResponsable();
		}
		case 2: {
			return clients.get(rowIndex).getNumTel();
		}
		case 3: {

		}

		default:
			throw new IllegalArgumentException();

		}
	}

	@Override
	public String getColumnName(int column) {

		return entete[column];

	}

}

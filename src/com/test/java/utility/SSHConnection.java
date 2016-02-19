package com.test.java.utility;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * @author ankit.goyal Class is user for making any SSH connection
 */
public class SSHConnection {
	private static SSHConnection sshConnection;
	private static Session session;
	private String server;
	private String userName;
	private String passWord;

	/* This method need to implement with global properties files */
	
	protected SSHConnection() {
		server = server;
		userName = userName;
		passWord = passWord;
	}

	protected SSHConnection(final String server, final String userName, final String passWord) {
		connectToServer(server, userName, passWord);
	}

	public static SSHConnection getInstance() {
		if (sshConnection == null) {
			synchronized (SSHConnection.class) {
				if (sshConnection == null) {
					return sshConnection = new SSHConnection();
				}
			}
		}
		return sshConnection;
	}

	public static SSHConnection getInstance(final String server, final String userName, final String passWord) {
		if (sshConnection == null) {
			synchronized (SSHConnection.class) {
				if (sshConnection == null) {
					return sshConnection = new SSHConnection(server, userName, passWord);
				}
			}
		}
		return sshConnection;
	}

	private void connectToServer(final String server, final String userName, final String passWord) {

		try {

			JSch jsch = new JSch();
			session = jsch.getSession(userName, server, 22);
			session.setPassword(passWord);
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			config.put("Compression", "yes");
			config.put("ConnectionAttempts", "2");
			session.setConfig(config);
			session.connect();

		} catch (JSchException e) {
			e.printStackTrace();
		}
	}

	public Session getSSHConnection(final String server, final String userName, final String passWord) {
		if (!session.isConnected()) {
			SSHConnection.getInstance(server, userName, passWord);
		}
		return session;
	}

	public Session getSSHConnection() {
		if (!session.isConnected()) {
			SSHConnection.getInstance();
		}
		return session;
	}

	public void closeSSHConnection() {
		if (session != null) {
			session.disconnect();
		}
	}
}

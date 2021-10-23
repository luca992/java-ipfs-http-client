package io.ipfs.api.exceptions;

public class DagNodeIsDirectoryException extends RuntimeException {
	public DagNodeIsDirectoryException() {
		super("This DAG node is a directory.");
	}
}

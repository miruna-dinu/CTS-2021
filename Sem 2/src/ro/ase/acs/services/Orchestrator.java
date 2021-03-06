package ro.ase.acs.services;

import ro.ase.acs.writers.Writeable;
import ro.ase.acs.main.IoC;
import ro.ase.acs.readers.Readable;

public class Orchestrator {
	private Readable reader;
	private Writeable writer;
	private IoC ioc;
	
	 //Sol 1 pt Dependency Inversion: Constructor Inversion Container

	public Orchestrator(Readable reader, Writeable writer, IoC ioc){
	        this.reader = reader;
	        this.writer = writer;
	        this.ioc = ioc;
	    }
	
	public void execute() {
		writer.write(reader.read());
	}
	
}
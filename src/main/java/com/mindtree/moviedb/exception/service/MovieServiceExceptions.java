package com.mindtree.moviedb.exception.service;

import com.mindtree.moviedb.exception.MoviedDbExceptions;

public class MovieServiceExceptions extends MoviedDbExceptions {

	public MovieServiceExceptions() {
		super();
	}

	public MovieServiceExceptions(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public MovieServiceExceptions(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public MovieServiceExceptions(String arg0) {
		super(arg0);
	}

	public MovieServiceExceptions(Throwable arg0) {
		super(arg0);
	}

}

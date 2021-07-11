package com.thinking.machines.orm.exceptions;
public class ORMException extends Exception
{
public ORMException(String message)
{
super(message);
}
public String getMessage()
{
return super.getMessage();
}
public String toString()
{
return super.getMessage();
}
}
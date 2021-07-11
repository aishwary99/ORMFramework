package com.thinking.machines.orm;
import com.thinking.machines.orm.wrapper.*;
import com.thinking.machines.orm.exceptions.*;
public class Entity
{
private InsertWrapper insertWrapper;
public Entity()
{
}
public void setInsertWrapper(InsertWrapper insertWrapper)
{
this.insertWrapper=insertWrapper;
}
public InsertWrapper getInsertWrapper()
{
return this.insertWrapper;
}
}
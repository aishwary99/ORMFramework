package com.thinking.machines.orm;
import com.thinking.machines.orm.wrapper.*;
import com.thinking.machines.orm.exceptions.*;
public class Entity
{
private InsertWrapper insertWrapper;
private UpdateWrapper updateWrapper;
private DeleteWrapper deleteWrapper;
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
public void setUpdateWrapper(UpdateWrapper updateWrapper)
{
this.updateWrapper=updateWrapper;
}
public UpdateWrapper getUpdateWrapper()
{
return this.updateWrapper;
}
public void setDeleteWrapper(DeleteWrapper deleteWrapper)
{
this.deleteWrapper=deleteWrapper;
}
public DeleteWrapper getDeleteWrapper()
{
return this.deleteWrapper;
}
}
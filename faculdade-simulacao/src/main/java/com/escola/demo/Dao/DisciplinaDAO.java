package com.escola.demo.Dao;

import com.escola.demo.Entity.Disciplina;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class DisciplinaDAO extends AbstractDAO<Disciplina, Integer>{


}

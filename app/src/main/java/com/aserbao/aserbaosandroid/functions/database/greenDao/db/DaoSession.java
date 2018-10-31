package com.aserbao.aserbaosandroid.functions.database.greenDao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.aserbao.aserbaosandroid.functions.database.greenDao.relation.beans.IdCard;
import com.aserbao.aserbaosandroid.functions.database.greenDao.relation.beans.CreditCard;
import com.aserbao.aserbaosandroid.functions.database.greenDao.relation.beans.StudentAndTeacherBean;
import com.aserbao.aserbaosandroid.functions.database.greenDao.relation.beans.Student;
import com.aserbao.aserbaosandroid.functions.database.greenDao.relation.beans.Teacher;
import com.aserbao.aserbaosandroid.functions.database.greenDao.beans.Thing;

import com.aserbao.aserbaosandroid.functions.database.greenDao.db.IdCardDao;
import com.aserbao.aserbaosandroid.functions.database.greenDao.db.CreditCardDao;
import com.aserbao.aserbaosandroid.functions.database.greenDao.db.StudentAndTeacherBeanDao;
import com.aserbao.aserbaosandroid.functions.database.greenDao.db.StudentDao;
import com.aserbao.aserbaosandroid.functions.database.greenDao.db.TeacherDao;
import com.aserbao.aserbaosandroid.functions.database.greenDao.db.ThingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig idCardDaoConfig;
    private final DaoConfig creditCardDaoConfig;
    private final DaoConfig studentAndTeacherBeanDaoConfig;
    private final DaoConfig studentDaoConfig;
    private final DaoConfig teacherDaoConfig;
    private final DaoConfig thingDaoConfig;

    private final IdCardDao idCardDao;
    private final CreditCardDao creditCardDao;
    private final StudentAndTeacherBeanDao studentAndTeacherBeanDao;
    private final StudentDao studentDao;
    private final TeacherDao teacherDao;
    private final ThingDao thingDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        idCardDaoConfig = daoConfigMap.get(IdCardDao.class).clone();
        idCardDaoConfig.initIdentityScope(type);

        creditCardDaoConfig = daoConfigMap.get(CreditCardDao.class).clone();
        creditCardDaoConfig.initIdentityScope(type);

        studentAndTeacherBeanDaoConfig = daoConfigMap.get(StudentAndTeacherBeanDao.class).clone();
        studentAndTeacherBeanDaoConfig.initIdentityScope(type);

        studentDaoConfig = daoConfigMap.get(StudentDao.class).clone();
        studentDaoConfig.initIdentityScope(type);

        teacherDaoConfig = daoConfigMap.get(TeacherDao.class).clone();
        teacherDaoConfig.initIdentityScope(type);

        thingDaoConfig = daoConfigMap.get(ThingDao.class).clone();
        thingDaoConfig.initIdentityScope(type);

        idCardDao = new IdCardDao(idCardDaoConfig, this);
        creditCardDao = new CreditCardDao(creditCardDaoConfig, this);
        studentAndTeacherBeanDao = new StudentAndTeacherBeanDao(studentAndTeacherBeanDaoConfig, this);
        studentDao = new StudentDao(studentDaoConfig, this);
        teacherDao = new TeacherDao(teacherDaoConfig, this);
        thingDao = new ThingDao(thingDaoConfig, this);

        registerDao(IdCard.class, idCardDao);
        registerDao(CreditCard.class, creditCardDao);
        registerDao(StudentAndTeacherBean.class, studentAndTeacherBeanDao);
        registerDao(Student.class, studentDao);
        registerDao(Teacher.class, teacherDao);
        registerDao(Thing.class, thingDao);
    }
    
    public void clear() {
        idCardDaoConfig.clearIdentityScope();
        creditCardDaoConfig.clearIdentityScope();
        studentAndTeacherBeanDaoConfig.clearIdentityScope();
        studentDaoConfig.clearIdentityScope();
        teacherDaoConfig.clearIdentityScope();
        thingDaoConfig.clearIdentityScope();
    }

    public IdCardDao getIdCardDao() {
        return idCardDao;
    }

    public CreditCardDao getCreditCardDao() {
        return creditCardDao;
    }

    public StudentAndTeacherBeanDao getStudentAndTeacherBeanDao() {
        return studentAndTeacherBeanDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public ThingDao getThingDao() {
        return thingDao;
    }

}

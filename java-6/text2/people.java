package text2;

public class people {
        public String m_name;
        public int m_id;
        public int m_age;

        public void setM_name(String name){
                if (name == ""){
                        m_name = "无名氏";
                }else
                        m_name = name;
        }
        public void setM_id(int id){
                m_id = id;
        }
        public void setM_age(int age) {
                m_age = age;
        }
}

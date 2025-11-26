package problem10.factory;

import java.lang.reflect.Field;
import java.util.List;

import org.dom4j.Element;

public class XmlBeanFactory {
    /**
     * This method loads the information from BeanDefinitions.xml and create an instance
     * for every <bean><bean/> using Java reflection APIs
     *
     * for your simplicity, I copy the entire XML here:
     * <beans>
     *     <bean id="harry" class="problem5.domain.Soldier">
     *         <property name="name" value="Harry Potter"></property>
     *         <property name="rank" value="Sergeant"></property>
     *         <property name="age" value="35"></property>
     *     </bean>
     *     <bean id="m1" class="problem5.domain.Tank">
     *         <property name="model" value="M1 Abrams"></property>
     *         <property name="speed" value="45"></property>
     *     </bean>
     * </beans>
     *
     * @param rootElement root element of BeanDefinitions.xml, which is <beans><beans/>
     */
    public void createBeanInstances(Element rootElement) {
        List<Element> beans = rootElement.elements("bean");

        for(Element bean : beans){
            createBeanInstance(bean);
        }
    }

    /**
     * This method creates an instance given a XML element
     *
     * @param beanElement i.e. <bean><bean/>
     */
    private void createBeanInstance(Element beanElement) {


        // print this newly created instance here, please uncomment below
        // System.out.println(beanInstance);
        String beanClassNam = beanElement.attributeValue("class");

        Object beanInstance = createObject(beanClassNam);

        List<Element> propElements = beanElement.elements("property");
        for(Element propElement : propElements){
            setPropertyForBeanInstance(beanInstance, propElement);
        }

        System.out.println(beanInstance);
    }

    /**
     * This method uses reflection to create an instance of the given fully qualified class name
     *
     * @param beanClassName
     * @return
     */
    private Object createObject(String beanClassName) {
        try {
            Class<?> clazz = Class.forName(beanClassName);
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Faled to create an instance of a class for: " + beanClassName, e);
        }
    }

    /**
     * This method set a value for the given field of the given beanInstance
     *
     * @param beanInstance
     * @param propertyElement XML element represents a field and its value, i.e. <property><property/>
     */
    private void setPropertyForBeanInstance(Object beanInstance, Element propertyElement) {
        try {
            String fileName = propertyElement.attributeValue("name");
            String value = propertyElement.attributeValue("value");

            Field field = beanInstance.getClass().getDeclaredField(fileName);
            field.setAccessible(true);

            Class<?> fieldType = field.getType();
            Object convertedValue;

            if(fieldType.equals(int.class) || fieldType.equals(Integer.class)){
                convertedValue = Integer.parseInt(value);
            } else {
                convertedValue = value;
            }

            field.set(beanInstance, convertedValue);
        } catch (Exception e) {
            throw new RuntimeException("Failed to set property for bean: " + beanInstance, e);
        }
    }
}

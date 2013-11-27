package base;

import java.io.DataOutputStream;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

/**
 * 
 * STREAMS
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 */

public class MyStreams

{

	public void saveToFile(String filePathWithName)

	{

		FileOutputStream fileOutputStream = null;

		DataOutputStream dataOutputStream = null;

		try

		{

			fileOutputStream = new FileOutputStream(filePathWithName);

			dataOutputStream = new DataOutputStream(fileOutputStream);

			dataOutputStream.writeUTF("Save some string here..");

		}

		catch (FileNotFoundException e)

		{

			e.printStackTrace();

		}

		catch (IOException e)

		{

			e.printStackTrace();

		}

		finally

		{

			if (dataOutputStream != null)

			{

				try

				{

					dataOutputStream.close();

				}

				catch (IOException e)

				{

					e.printStackTrace();

				}

			}

			if (fileOutputStream != null)

				try

				{

					fileOutputStream.close();

				}

				catch (IOException e)

				{

					e.printStackTrace();

				}

		}

	}

	public void readFromFile(String filePathWithName)

	{

		FileInputStream fileInputStream = null;

		try

		{

			fileInputStream = new FileInputStream(filePathWithName);

		}

		catch (FileNotFoundException e)

		{

			e.printStackTrace();

		}

		finally

		{

			if (fileInputStream != null)

				try

				{

					fileInputStream.close();

				}

				catch (IOException e)

				{

					e.printStackTrace();

				}

		}

	}

	public static void main(String[] args)

	{

	}

}
